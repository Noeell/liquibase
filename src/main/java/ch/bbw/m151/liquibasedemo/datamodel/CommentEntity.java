package ch.bbw.m151.liquibasedemo.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class CommentEntity {

    @Id
    Integer id;

    @ManyToOne
    ArticleEntity article;

}
