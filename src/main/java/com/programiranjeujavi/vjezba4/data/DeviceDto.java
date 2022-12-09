package com.programiranjeujavi.vjezba4.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDto {
    private Long id;
    private String modelName;
}
