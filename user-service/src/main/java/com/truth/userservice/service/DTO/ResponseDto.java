package com.truth.userservice.service.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor@NoArgsConstructor
public class ResponseDto {
    private DepartmentDto departmentDto;
    private UserDto userDto;
}
