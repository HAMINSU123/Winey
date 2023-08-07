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

    List<OrderDetailVo> selOrderDetail(int orderId); //상세 주문 내역 리스트 by orderId
    List<OrderRefundVo> selOrderRefund(SelListDto dto); //환불된 상품과 환불 사유 출력

}
