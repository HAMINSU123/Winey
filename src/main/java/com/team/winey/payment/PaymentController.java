package com.team.winey.payment;

import com.team.winey.admin.model.OrderDetailVo;
import com.team.winey.payment.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor
@Tag(name = "결제")
public class PaymentController {

    private final PaymentService service;

    @PostMapping("/payment")
    @Operation(summary = "결제", description =
            "storeId: 매장PK값, <br>"
                    + "totalOrderPrice: 총 결제 금액, <br>"
                    + "pickupTime: 픽업타임, <br>"
                    + "orderStatus: 주문상태, <br>"
                    + "cartId: 카트 pk값 <br>"
                    + "quantity: 수량 <br>"
                    + "productId: 결제하려는제품 pk값 <br>"
                    + "orderId: 결제 완료시 t_order의 pk 값이 출력 됩니다 <br>")
    public int postPayment(@RequestBody PaymentInsDto dto) {
        return service.insPayment(dto);
    }


    @PutMapping("/orderstatus")
    @Operation(summary = "주문상태 변경", description =
            "orderStatus: 주문 상태, <br>")
    public int putPayment(@RequestBody PaymentUpdDto dto) {
        return service.updPayment(dto);
    }


//    @GetMapping("/sumPrice")
//    @Operation(summary = "결제 총금액", description =
//            "userId: user pk값 <br>")
//    public int getSumPrice(){
//        return service.selSumPrice();
//    }

    @PostMapping("/review")
    @Operation(summary = "리뷰 작성", description =
            "orderDetailId: 주문상세 pk값, <br>"
                    + "review_level: 1번 좋아요 <br>"
                    + "2번 보통이에요 <br>"
                    + "3번 취향 아니에요 <br>")
    public int postReview(@RequestBody ReviewInsDto dto) {
        return service.insReview(dto);
    }


    @GetMapping("/region")
    @Operation(summary = "픽업 지역", description =
            "userId: 사용자 pk값, <br>"
                    + "regionNmId: 지역 pk값 <br>"
                    + "regionNm: 지역 이름 <br>"
                    + "storeId: 가게 pk값 <br>"
                    + "nm: 지점명 <br>")
    public List<RegionSelVO> getRegion() {
        return service.selRegion();
    }
//    @Operation(summary = "주문 상세 내역 출력",description =
//            "orderDate: 주문날짜 <br>"
//                    +"nmKor: 한글 이름 <br>"
//                    +"totalPrice: 총 금액 <br>"
//                    +"payment: 카드결제(1번) <br>"
//                    +"storeNm: 지점명 <br>"
//                    +"pickUpTime: 픽업 시간 <br>"
//                    +"orderStatus: 주문 상태 <br>")
//    @GetMapping("/order/{orderId}")
//    public List<OrderSelDetailVo> getOrderDetail(@PathVariable int orderId) {
//        return service.getOrderDetail(orderId);
//    }

}