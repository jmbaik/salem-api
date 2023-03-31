package metel.salem.api.mapper;

import metel.salem.api.dto.AdminUserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface AdminUserMapper {
    AdminUserDto selectAdminLoginInfo(AdminUserDto adminUserDto);
}
