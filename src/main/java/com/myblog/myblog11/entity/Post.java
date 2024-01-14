package com.myblog.myblog11.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="posts")
public class Post {
  private int id;
  private String title;
  private String description;
  private String content;
}
