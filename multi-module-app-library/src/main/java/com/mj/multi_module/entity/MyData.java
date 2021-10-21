package com.mj.multi_module.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class MyData {

    private String content;

    public MyData(String content) {
        this.content = content;
    }
}
