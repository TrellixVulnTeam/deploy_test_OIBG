package com.ssafy.niceage.Controller.Request;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
@ApiModel(value = "클라이언트에서 게시판 이용시 넘어오는 board, user 정보", description = "게시판 CRUD에 필요한 회원ID와 제목, 내용")
public class BoardRequest {
	@ApiModelProperty(value = "BoardId")
	private Long boardId;
	
	@ApiModelProperty(value = "Title")
	private String boardTitle;
	
	@ApiModelProperty(value = "Contents")
	private String boardContents;
	
	@ApiModelProperty(value = "Date")
	private Date boardDate;

	@ApiModelProperty(value = "UserID")
	private String userId;
	
//	@ApiModelProperty(value = "Comments")
//	private List<Comment> comments;
	
}