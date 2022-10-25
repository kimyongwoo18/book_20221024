package com.icia.book.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class BookDTO {
    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private int bookPrice;
    private String bookPublisher;

}
