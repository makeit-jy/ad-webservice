package com.incomad.web.dto;

import com.incomad.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardSaveRequestDto {
    private String title;
    private String content;

    @Builder
    public BoardSaveRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Board toEntity(){
        return Board.builder()
                    .title(title)
                    .content(content)
                    .build();
    }
}