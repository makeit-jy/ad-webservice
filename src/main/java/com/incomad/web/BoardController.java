package com.incomad.web;

import com.incomad.service.BoardService;
import com.incomad.web.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/api/v1/board")
    public Long save(@RequestBody BoardSaveRequestDto requestDto){
        boardService.save(requestDto);
        return Long.valueOf(1);
    }

//    @PutMapping("/api/v1/board/{id}")
//    public Long update(@PathVariable Long id, @RequestBody BoardUpdateRequestDto requestDto) {
//        return boardService.update(id, requestDto);
//    }
//
//    @DeleteMapping("/api/v1/board/{id}")
//    public Long delete(@PathVariable Long id) {
//        boardService.delete(id);
//        return id;
//    }

}