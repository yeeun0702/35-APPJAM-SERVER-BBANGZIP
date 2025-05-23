package com.sopt.bbangzip.domain.badge.api.dto.response;

import java.util.List;

public record BadgeListResponse(
        String nickname,
        List<Badge> badgeList
) {
    public static record Badge(
            String badgeCategory,
            String badgeName,
            Boolean badgeIsLocked,
            String badgeImage
    ) {
    }
}

