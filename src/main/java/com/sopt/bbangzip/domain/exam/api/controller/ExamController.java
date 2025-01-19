package com.sopt.bbangzip.domain.exam.api.controller;

import com.sopt.bbangzip.common.exception.base.NotFoundException;
import com.sopt.bbangzip.common.exception.code.ErrorCode;
import com.sopt.bbangzip.domain.exam.api.dto.response.ExamResponseDto;
import com.sopt.bbangzip.domain.exam.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ExamController {
    private final ExamService examService;

    /**
     * 특정 시험 정보 조회 (중간고사/기말고사 구분)
     *
     * @param subjectId 과목 ID
     * @param examName  시험 이름 ("mid" 또는 "fin")
     * @return ExamResponseDto
     */
    @GetMapping("/exams/{subjectId}/{examName}")
    public ResponseEntity<ExamResponseDto> getExamInfo(
            @PathVariable final long subjectId,
            @PathVariable final String examName
    ) {
        ExamResponseDto response = examService.getExamInfoWithConversion(subjectId, examName);
        return ResponseEntity.ok(response);
    }
}


