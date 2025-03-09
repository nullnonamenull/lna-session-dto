package com.noname.lnasessiondto;

import com.noname.lnasessiondto.enumerated.MessageAuthor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class MessageDTO {

    private UUID sessionId;
    private String content;
    private MessageAuthor sender;

}