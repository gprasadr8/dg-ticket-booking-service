package com.dg.tbs.ts.service;

import com.dg.tbs.ts.entity.TheatreEntity;
import com.dg.tbs.ts.exception.TheatreNotFoundException;
import com.dg.tbs.ts.models.TheatreInfo;
import com.dg.tbs.ts.repository.TheatreRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TheatreService {
    private final TheatreRepository theatreRepository;

    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    @Transactional
    public List<TheatreInfo> getAllTheatresByCity(String cityId){
        return theatreRepository.findAllByCity(cityId).map(this::convertFromEntity).collect(Collectors.toList());
    }



    public TheatreInfo getTheatreDetailsById(long theatreId) {
        return theatreRepository.findById(theatreId)
                .map(this::convertFromEntity)
                .orElseThrow(()->new TheatreNotFoundException("Theatre not found with theatre Id: "+theatreId));
    }



    private TheatreInfo convertFromEntity(TheatreEntity theatreEntity){
        TheatreInfo theatreInfo = new TheatreInfo();
        theatreInfo.setId(theatreEntity.getId());
        theatreInfo.setName(theatreEntity.getName());
        theatreInfo.setArea(theatreEntity.getArea());
        theatreInfo.setCity(theatreEntity.getCity());
        theatreInfo.setState(theatreEntity.getState());
        theatreInfo.setCountry(theatreEntity.getCountry());
        return theatreInfo;
    }
}
