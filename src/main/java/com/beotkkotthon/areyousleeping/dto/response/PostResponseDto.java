package com.beotkkotthon.areyousleeping.dto.response;

import com.beotkkotthon.areyousleeping.domain.Post;
import com.beotkkotthon.areyousleeping.domain.User;
import lombok.Builder;

@Builder
public record PostResponseDto(
        Long postId,
        String postTitle,
        Long userId,
        String nickname,
        String profileImageUrl,
        String createdAt
) {
    public static PostResponseDto fromEntity(Post post) {
        return PostResponseDto.builder()
                .postId(post.getId())
                .postTitle(post.getPostTitle())
                .userId(post.getUser().getId())
                .nickname(post.getUser().getNickname())
                .profileImageUrl(post.getUser().getProfileImageUrl())
                .createdAt(post.getCreatedAt().toString())
                .build();
    }
}
