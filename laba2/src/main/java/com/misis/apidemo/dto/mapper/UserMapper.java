package com.misis.apidemo.dto.mapper;

import com.misis.apidemo.db.User;
import com.misis.apidemo.dto.UserCreateDTO;
import com.misis.apidemo.dto.UserDTO;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", source = "id")
    UserDTO toDTO(User user);

    User toEntity(UserCreateDTO userDTO);

    List<UserDTO> toDTOList(List<User> users);

}
