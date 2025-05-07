package com.noname.lnasessiondto.enumerated;

import lombok.Getter;

@Getter
public enum Role {
    SYSTEM("system"),
    USER("user"),
    ASSISTANT("assistant");

    private final String value;

    Role(String value) {
        this.value = value;
    }

}