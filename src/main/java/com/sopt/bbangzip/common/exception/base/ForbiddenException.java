package com.sopt.bbangzip.common.exception.base;

import com.sopt.bbangzip.common.exception.code.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ForbiddenException extends RuntimeException{
    private final ErrorCode errorCode;
}
