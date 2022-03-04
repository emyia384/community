package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {

    //查某一页的帖子的评论
    List<Comment> selectCommentsByEntity(int entityType,int entityId,int offset,int limit);
    //帖子评论数
    int selectCountByEntity(int entityType, int entityId);
    //给某条帖子评论
    int insertComment(Comment comment);
    //查某条帖子
    Comment selectCommentById(int id);
}
