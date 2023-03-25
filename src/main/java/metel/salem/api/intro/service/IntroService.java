package metel.salem.api.intro.service;

import metel.salem.api.dto.AreaCodeDto;
import metel.salem.api.dto.IntroDto;
import metel.salem.api.mapper.IntroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class IntroService {
    @Autowired
    private IntroMapper mapper;

    public List<IntroDto> selectIntroList(HashMap<String, Object> map){
        return mapper.selectIntroList(map);
    }
    public List<AreaCodeDto> selectAreaCode(){
        return mapper.selectAreaCode();
    }
}
