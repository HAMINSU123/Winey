package com.team.winey.recommend;


import com.team.winey.recommend.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "사용자맞춤와인추천")
@Slf4j
@RestController
@RequestMapping("/api/recommend")
@RequiredArgsConstructor
public class RecommendController {
    private final RecommendService service;

    @PostMapping("/wine")
    @Operation(summary = "사용자취향에 맞는 와인추천", description =
            "값을 보낼때 categoryId와countryId와smallCategoryId는 값을 선택하지 않을 떄는 json에서 아예 삭제를 해주셔야합니다! 나머지는 아무값 입력안하면 자동으로 조건을 무시합니다." +
                    "categoryId:와인종류 1:레드와인, 2:화이트와인, 3:스파클링와인, 4:기타 ex) 1,3 이 가능 <br>" +
                    "countryId: 원산지 1:미국, 2:스페인, 3:이탈리아, 4:칠레, 5:포르투갈, 6:프랑스 ex:위와 동일<br>" +
                    "smallcategoryId: 페어링음식 12번까지있으며 1:steak, 2:chicken, 3:lamb, 4:pork, 5:oyster, 6:fish, 7:shrimp, 8:clamp, 9:cheeze, 10:fruit, 11:pizza, 12:pasta ex: 위와 동일 <br>" +
                    "priceRange: 가격범위 입력시 0번부터 4번까지 있으며 입력시에 0:아무거나를 뜻합니다.1:2만원미만, 2:2만원이상 5만원미만, 3:5만원이상 10만원미만, 4:10만원이상,  ex) 3 " +
                    "향 또한 스킵이 가능하고 입력시에 각 이름에 0이면 향없음 1이면 향있음입니다. ex) flower:0,plant:1,fruit:0, spicy:1, earth:0, oak:1, nuts:0 " +
                    "주의사항: 로그인이 되어있을때 사용하셔야합니다. <br>")
    public List<Long> Recommendations(@RequestBody RecommendRes res) {
        return service.selRecommand(res);
    }

    @GetMapping("/loginuser")
    @Operation(summary = "로그인한 유저의 PK값")
    public int LoginUserPk(){
        return service.loginUserPk();
    }

    @GetMapping("/getUserInfo")
    @Operation(summary = "유저정보")
    public List<Integer> getUserInfo() {
        return service.selUserinfo();
    }
}

