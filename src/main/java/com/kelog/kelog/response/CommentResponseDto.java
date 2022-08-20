package com.kelog.kelog.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponseDto {

    private Long commentcount;

    private Long commentId;

    private Long memberId;

    private String username;

    private String comment;

    private LocalDate createdAt;

    private LocalDate modifiedAt;


}
