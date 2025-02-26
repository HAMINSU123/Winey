package com.team.winey.admin;

import com.team.winey.admin.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    //상품 등록
    int insProduct(ProductInsDto dto);
    int insFeature(ProductInsDto dto);
    int insAroma(ProductAromaDto dto);
    int insSale(ProductInsDto dto);
    int insWinePairing(ProductInsDto dto);

    //상품 수정
    ProductUpdDto selProductFk(int productId); // 특정 product의 FK값 구하기

    int updFeature(ProductUpdDto dto);
    int updAroma(ProductAromaDto dto);
    int updSale(ProductUpdDto dto);
    int delWinePairing(ProductUpdDto dto);
    int updProduct(ProductUpdDto dto);

    //리스트 출력
    List<ProductVo> selProduct(SelListDto dto);
    List<ProductSaleVo> selProductSale(SelListDto dto);
    List<UserVo> selUserList(SelListDto dto);

    List<UserOrderDetailVo> selUserOrder(UserOrderDetailDto dto);

    List<OrderListVo> selOrder(SelListDto dto); //주문 내역
    List<OrderDetailVo> selOrderDetail(int orderId); //상세 주문 내역 리스트 by orderId
    List<OrderRefundVo> selOrderRefund(SelListDto dto); //전체 환불된 상품과 환불 사유 출력
    List<OrderRefundVo> selOrderRefundById(SelListDto dto, Long userId); //환불된 상품과 환불 사유 출력 by userId

    int insStore(StoreInsDto dto); //매장 정보 등록
    List<StoreVo> selStore(SelListDto dto); //매장 리스트 출력
    int updStore(StoreInsDto dto); //매장 정보 수정
    Long delStore(Long storeId); //매장 정보 삭제

    int updOrderStatus(OrderStatusDto dto); //주문상태 업데이트 (관리자 페이지에서)

    int updSaleYnOn(ProductUpdDto dto); //세일 스케줄러용. saleYn을 1로 update
    int updSaleYnOff(ProductUpdDto dto); //세일 스케줄러용. saleYn을 0으로 update

    int updSaleYn(ProductSaleYnDto dto); //할인 상태(saleYn) 업데이트 (관리자가 수동으로 On/Off하는 용도)

    //페이징 처리
    int productCount(); //product 개수 카운트
    int productSaleCount(); //saleYn = 1인 상품 개수
    int userCount(); //가입회원 수
    int userOrderCount(Long userId); //userOrder 개수 카운트
    UserInfo selUserInfo(Long userId); //피그마(회원상세내역)페이지 회원정보 출력용
    int orderCount(); //order 수
    int storeCount(); //store 수

}
