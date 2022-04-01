package com.ssafy.handtohand.domain.model.entity.item;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import static javax.persistence.GenerationType.*;

@Entity
@Getter
@Table(name = "items")
@DynamicInsert
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="item_seq")
    /* 작품 키 */
    private Long seq;

    @Column(name="item_hash")
    /* 작품 이미지 */
    private String hash;

    @Column(name="item_token_id")
    /* 작품 NFT 주소 */
    private String tokenId;

    @Column(name="item_title")
    /* 작품 이름 */
    private String title;

    @Column(name="item_owner_address")
    /* 소유자 지갑주소 */
    private String ownerAddress;

    @Setter
    @Column(name="item_on_sale_yn")
    /* 판매 중인지 여부 */
    private int onSaleYn;

    @Setter
    @Column(name="item_price")
    /* 작품현재가격 */
    private double price;

    @Setter
    @Column(name="item_like_count")
    /* 작품 좋아요 수 */
    private int likeCount;

}

