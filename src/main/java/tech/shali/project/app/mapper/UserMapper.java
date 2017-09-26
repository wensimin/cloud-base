package tech.shali.project.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import tech.shali.project.app.entity.SysUser;

@Mapper
public interface UserMapper {
	
	@SelectProvider(type = UserMapperProvider.class, method = "findByNameLike")
	public List<SysUser> findByNameLike(String name);
}
