package metel.salem.api.intro.service;

import lombok.RequiredArgsConstructor;
import metel.salem.api.dto.AdminUserDto;
import metel.salem.api.dto.IntroDto;
import metel.salem.api.mapper.AdminUserMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminUserService {

    private final AdminUserMapper mapper;

    public AdminUserDto selectAdminLoginInfo(AdminUserDto adminUserDto){
        return mapper.selectAdminLoginInfo(adminUserDto);
    }

}
