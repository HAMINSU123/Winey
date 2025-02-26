package com.team.winey.main;

import com.team.winey.main.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "와인 리스트")
@RestController
@RequestMapping("/api/main")
@RequiredArgsConstructor
public class MainController {

    @Bean
    public OpenAPI OpenAPI() {
        final Info info = new Info().version("v1.0.0").title("winey").description("SECOND PROJECT");
        return new OpenAPI().info(info);
    }

    private final MainService SERVICE;

    @GetMapping("/redWine")
    @Operation(summary = "레드와인", description = "레드와인만 모아놨지롱")
    public List<WineTotalVo> getRedWines(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.redWine(dto);
    }

    @GetMapping("/redWine/new")
    @Operation(summary = "레드와인 - 최신등록순")
    public List<WineTotalVo> getRedWinesNew(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.redWineByNew(dto);
    }

    @GetMapping("/redWine/expencive")
    @Operation(summary = "레드와인 - 높은가격순")
    public List<WineTotalVo> getRedWinesExpencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.redWineByExpencive(dto);
    }

    @GetMapping("/redWine/cheap")
    @Operation(summary = "레드와인 - 낮은가격순")
    public List<WineTotalVo> getRedWinesCheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.redWineByCheap(dto);
    }

    //====================================================================

    @GetMapping("/whiteWine")
    @Operation(summary = "화이트와인", description = "화이트와인만 모아놨지롱")
    public List<WineTotalVo> getWhiteWines(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.whiteWine(dto);
    }

    @GetMapping("/whiteWine/new")
    @Operation(summary = "화이트와인 - 최신등록순")
    public List<WineTotalVo> getWhiteWinesNew(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.whiteWineByNew(dto);
    }

    @GetMapping("/whiteWine/expencive")
    @Operation(summary = "화이트와인 - 높은가격순")
    public List<WineTotalVo> getWhiteWinesExpencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.whiteWineByExpencive(dto);
    }

    @GetMapping("/whiteWine/cheap")
    @Operation(summary = "화이트와인 - 낮은가격순")
    public List<WineTotalVo> getWhiteWinesCheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.whiteWineByCheap(dto);
    }

    //====================================================================

    @GetMapping("/sparklingWine")
    @Operation(summary = "스파클링와인", description = "스파클링와인만 모아놨지롱")
    public List<WineTotalVo> getsparklingWines(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.sparklingWine(dto);
    }

    @GetMapping("/sparklingWine/new")
    @Operation(summary = "스파클링와인 - 최신등록순")
    public List<WineTotalVo> getsparklingWinesNew(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.sparklingWineByNew(dto);
    }

    @GetMapping("/sparklingWine/expencive")
    @Operation(summary = "스파클링와인 - 높은가격순")
    public List<WineTotalVo> getsparklingWinesExpencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.sparklingWineByExpencive(dto);
    }

    @GetMapping("/sparklingWine/cheap")
    @Operation(summary = "스파클링와인 - 낮은가격순")
    public List<WineTotalVo> getsparklingWinesCheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.sparklingWineByCheap(dto);
    }

    //====================================================================

    @GetMapping("/otherWine")
    @Operation(summary = "기타와인", description = "기타와인만 모아놨지롱")
    public List<WineTotalVo> getOtherWines(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.otherWine(dto);
    }

    @GetMapping("/otherWine/new")
    @Operation(summary = "기타와인 - 최신등록순")
    public List<WineTotalVo> getOtherWinesNew(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.otherWineByNew(dto);
    }

    @GetMapping("/otherWine/expencive")
    @Operation(summary = "기타와인 - 높은가격순")
    public List<WineTotalVo> getOtherWinesExpencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.otherWineByExpencive(dto);
    }

    @GetMapping("/otherWine/cheap")
    @Operation(summary = "기타와인 - 낮은가격순")
    public List<WineTotalVo> getOtherWinesCheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.otherWineByCheap(dto);
    }

    //====================================================================

    @GetMapping("/wines/price")
    @Operation(summary = "금액 10원단위 절삭", description = "디비 새로 만들 때 마다 기본적으로 해놓을테니 신경 안쓰셔도 됩니다!")
    public List<WineTotalVo> getWinesPrice() {
        return SERVICE.selWinePrice();
    }

    @GetMapping("/wines/salePrice")
    @Operation(summary = "세일금액 변경", description = "디비 새로 만들 때 마다 기본적으로 해놓을테니 신경 안쓰셔도 됩니다!")
    public List<WineTotalVo> getWinesSalePrice() {
        return SERVICE.selWineSalePrice();
    }

   /* @GetMapping("/feature")
    @Operation(summary = "입문 레벨", description = "productId 입력하면 됩니다<br><br>" +
            "Responses : 1 > 레벨1<br>" +
            "Responses : 2 > 레벨2<br>" +
            "Responses : 3 > 레벨3<br>")
    public int getFeature(@RequestParam Long productId) {
        WineFeatureDto dto = new WineFeatureDto();
        dto.setProductId(productId);
        return SERVICE.selFeature(dto);
    }*/

    @GetMapping("/wines")
    @Operation(summary = "전체 와인리스트", description = "{<br>" +
            "    \"productId\": 상품 PK값,<br>" +
            "    \"categoryId\": 카테고리 PK값,<br>" +
            "    \"featureId\": 맛 PK값,<br>" +
            "    \"countryId\": 국가 PK값,<br>" +
            "    \"aromaId\": 향 PK값,<br>" +
            "    \"nmKor\": 한글 이름,<br>" +
            "    \"nmEng\": 영어 이름,<br>" +
            "    \"price\": 가격,<br>" +
            "    \"quantity\": 수량,<br>" +
            "    \"pic\": 사진,<br>" +
            "    \"promotion\": 프로모션,<br>" +
            "    \"beginner\": 입문자,<br>" +
            "    \"alcohol\": 알코올 도수<br>" +
            "  }")
    public List<WineTotalVo> getWines(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWine(dto);
    }

    @GetMapping("/wines/new")
    @Operation(summary = "전체 와인리스트 - 최신등록순")
    public List<WineTotalVo> getWinesNew(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByNew(dto);
    }

    @GetMapping("/wines/expencive")
    @Operation(summary = "전체 와인리스트 - 높은가격순")
    public List<WineTotalVo> getWinesExpencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByExpencive(dto);
    }

    @GetMapping("/wines/cheap")
    @Operation(summary = "전체 와인리스트 - 낮은가격순")
    public List<WineTotalVo> getWinesCheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByCheap(dto);
    }

    //====================================================================


    @GetMapping("/wines/{productId}")
    @Operation(summary = "와인 디테일")
    public WineTotalVo getWinebyId(@PathVariable Long productId) {
        return SERVICE.selWineById(new WineSelDetailDto(productId));
    }

    //=====================================================================

    @GetMapping("/price2")
    @Operation(summary = "2만원 미만 와인리스트", description = "{<br>" +
            "    \"productId\": 상품 PK값,<br>" +
            "    \"categoryId\": 카테고리 PK값,<br>" +
            "    \"featureId\": 맛 PK값,<br>" +
            "    \"countryId\": 국가 PK값,<br>" +
            "    \"aromaId\": 향 PK값,<br>" +
            "    \"nmKor\": 한글 이름,<br>" +
            "    \"nmEng\": 영어 이름,<br>" +
            "    \"price\": 가격,<br>" +
            "    \"quantity\": 수량,<br>" +
            "    \"pic\": 사진,<br>" +
            "    \"promotion\": 프로모션,<br>" +
            "    \"beginner\": 입문자,<br>" +
            "    \"alcohol\": 알코올 도수<br>" +
            "  }")
    public List<WineTotalVo> getWineByPrice2(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice2(dto);
    }

    @GetMapping("/price2/new")
    @Operation(summary = "2만원 미만 와인리스트 - 최신등록순")
    public List<WineTotalVo> getWineByPrice2New(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice2New(dto);
    }

    @GetMapping("/price2/expencive")
    @Operation(summary = "2만원 미만 와인리스트 - 높은가격순")
    public List<WineTotalVo> getWineByPrice2Expencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice2Expencive(dto);
    }

    @GetMapping("/price2/cheap")
    @Operation(summary = "2만원 미만 와인리스트 - 낮은가격순")
    public List<WineTotalVo> getWineByPrice2Cheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice2Cheap(dto);
    }

    //=====================================================================

    @GetMapping("/price25")
    @Operation(summary = "2-5만원 와인리스트", description = "{<br>" +
            "    \"productId\": 상품 PK값,<br>" +
            "    \"categoryId\": 카테고리 PK값,<br>" +
            "    \"featureId\": 맛 PK값,<br>" +
            "    \"countryId\": 국가 PK값,<br>" +
            "    \"aromaId\": 향 PK값,<br>" +
            "    \"nmKor\": 한글 이름,<br>" +
            "    \"nmEng\": 영어 이름,<br>" +
            "    \"price\": 가격,<br>" +
            "    \"quantity\": 수량,<br>" +
            "    \"pic\": 사진,<br>" +
            "    \"promotion\": 프로모션,<br>" +
            "    \"beginner\": 입문자,<br>" +
            "    \"alcohol\": 알코올 도수<br>" +
            "  }")
    public List<WineTotalVo> getWineByPrice25(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice25New(dto);
    }

    @GetMapping("/price25/new")
    @Operation(summary = "2-5만원 와인리스트 - 최신등록순")
    public List<WineTotalVo> getWineByPrice25New(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice2New(dto);
    }

    @GetMapping("/price25/expensive")
    @Operation(summary = "2-5만원 와인리스트 - 높은가격순")
    public List<WineTotalVo> getWineByPrice25Expencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice25Expencive(dto);
    }

    @GetMapping("/price25/cheap")
    @Operation(summary = "2-5만원 와인리스트 - 낮은가격순")
    public List<WineTotalVo> getWineByPrice25Cheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice25Cheap(dto);
    }
    //=====================================================================

    @GetMapping("/price510")
    @Operation(summary = "5-10만원 와인리스트", description = "{<br>" +
            "    \"productId\": 상품 PK값,<br>" +
            "    \"categoryId\": 카테고리 PK값,<br>" +
            "    \"featureId\": 맛 PK값,<br>" +
            "    \"countryId\": 국가 PK값,<br>" +
            "    \"aromaId\": 향 PK값,<br>" +
            "    \"nmKor\": 한글 이름,<br>" +
            "    \"nmEng\": 영어 이름,<br>" +
            "    \"price\": 가격,<br>" +
            "    \"quantity\": 수량,<br>" +
            "    \"pic\": 사진,<br>" +
            "    \"promotion\": 프로모션,<br>" +
            "    \"beginner\": 입문자,<br>" +
            "    \"alcohol\": 알코올 도수<br>" +
            "  }")
    public List<WineTotalVo> getWineByPrice510(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice510(dto);
    }

    @GetMapping("/price510/new")
    @Operation(summary = "5-10만원 와인리스트 - 최신등록순")
    public List<WineTotalVo> getWineByPrice510New(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice510New(dto);
    }

    @GetMapping("/price510/expensive")
    @Operation(summary = "5-10만원 와인리스트 - 높은가격순")
    public List<WineTotalVo> getWineByPrice510Expencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice510Expencive(dto);
    }

    @GetMapping("/price510/cheap")
    @Operation(summary = "5-10만원 와인리스트 - 낮은가격순")
    public List<WineTotalVo> getWineByPrice510Cheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice510Cheap(dto);
    }
    //=====================================================================

    @GetMapping("/price10")
    @Operation(summary = "10만원 이상 와인리스트", description = "{<br>" +
            "    \"productId\": 상품 PK값,<br>" +
            "    \"categoryId\": 카테고리 PK값,<br>" +
            "    \"featureId\": 맛 PK값,<br>" +
            "    \"countryId\": 국가 PK값,<br>" +
            "    \"aromaId\": 향 PK값,<br>" +
            "    \"nmKor\": 한글 이름,<br>" +
            "    \"nmEng\": 영어 이름,<br>" +
            "    \"price\": 가격,<br>" +
            "    \"quantity\": 수량,<br>" +
            "    \"pic\": 사진,<br>" +
            "    \"promotion\": 프로모션,<br>" +
            "    \"beginner\": 입문자,<br>" +
            "    \"alcohol\": 알코올 도수<br>" +
            "  }")
    public List<WineTotalVo> getWineByPrice10(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice10(dto);
    }

    @GetMapping("/price10/new")
    @Operation(summary = "10만원 이상 와인리스트 - 최신등록순")
    public List<WineTotalVo> getWineByPrice10New(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice10New(dto);
    }

    @GetMapping("/price10/expensive")
    @Operation(summary = "10만원 이상 와인리스트 - 높은가격순")
    public List<WineTotalVo> getWineByPrice10Expencive(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice10Expencive(dto);
    }

    @GetMapping("/price10/cheap")
    @Operation(summary = "10만원 이상 와인리스트 - 낮은가격순")
    public List<WineTotalVo> getWineByPrice10Cheap(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "9") int row) {
        WineSelDto dto = new WineSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByPrice10Cheap(dto);
    }

    @GetMapping("/country")
    @Operation(summary = "국가별 와인리스트", description = "\"countryId\": 국가 PK값 입력 </br></br>" +
            "1 : 미국<br>" +
            "2 : 스페인<br>" +
            "3 : 프랑스<br>" +
            "4 : 이탈리아<br>" +
            "5 : 포르투갈<br>" +
            "6 : 칠레<br><br>" +
            "{<br>" +
            "    \"productId\": 상품 PK값,<br>" +
            "    \"categoryId\": 카테고리 PK값,<br>" +
            "    \"featureId\": 맛 PK값,<br>" +
            "    \"countryId\": 국가 PK값,<br>" +
            "    \"aromaId\": 향 PK값,<br>" +
            "    \"nmKor\": 한글 이름,<br>" +
            "    \"nmEng\": 영어 이름,<br>" +
            "    \"price\": 가격,<br>" +
            "    \"quantity\": 수량,<br>" +
            "    \"pic\": 사진,<br>" +
            "    \"promotion\": 프로모션,<br>" +
            "    \"beginner\": 입문자,<br>" +
            "    \"alcohol\": 알코올 도수<br>" +
            "  }")
    public List<WineTotalVo> getWineByCountry(@RequestParam Long countryId
                                            , @RequestParam(defaultValue = "1") int page
                                            , @RequestParam(defaultValue = "9") int row) {
        WineSelByCountryDto dto = new WineSelByCountryDto();
        dto.setCountryId(countryId);
        dto.setPage(page);
        dto.setRow(row);
        return SERVICE.selWineByCountry(dto);
    }

    @GetMapping("/country/new/")
    @Operation(summary = "국가별 와인리스트 - 최신등록순")
    public List<WineTotalVo> getWineByCountryNew(@RequestParam Long countryId
                                                , @RequestParam(defaultValue = "1") int page
                                                , @RequestParam(defaultValue = "9") int row) {
        WineSelByCountryDto dto = new WineSelByCountryDto();
        dto.setCountryId(countryId);
        dto.setPage(page);
        dto.setRow(row);
        dto.setCountryId(countryId);
        return SERVICE.selWineByCountryNew(dto);
    }
    @GetMapping("/country/expensive")
    @Operation(summary = "국가별 와인리스트 - 높은금액순")
    public List<WineTotalVo> getWineByCountryExpensive(@RequestParam Long countryId
                                                    , @RequestParam(defaultValue = "1") int page
                                                    , @RequestParam(defaultValue = "9") int row) {
        WineSelByCountryDto dto = new WineSelByCountryDto();
        dto.setCountryId(countryId);
        dto.setPage(page);
        dto.setRow(row);
        dto.setCountryId(countryId);
        return SERVICE.selWineByCountryExpencive(dto);
    }

    @GetMapping("/country/cheap")
    @Operation(summary = "국가별 와인리스트 - 낮은금액순")
    public List<WineTotalVo> getWineByCountryCheap(@RequestParam Long countryId
                                                , @RequestParam(defaultValue = "1") int page
                                                , @RequestParam(defaultValue = "9") int row) {
        WineSelByCountryDto dto = new WineSelByCountryDto();
        dto.setCountryId(countryId);
        dto.setPage(page);
        dto.setRow(row);
        dto.setCountryId(countryId);
        return SERVICE.selWineByCountryCheap(dto);
    }



    @GetMapping("/food")
    @Operation(summary = "음식별 와인리스트", description = "\"bigCategoryId\": 음식 카테고리 입력</br></br>" +
            "1 : meet</br>" +
            "2 : seafood</br>" +
            "3 : otherfood</br></br>" +
            "{<br>" +
            "    \"productId\": 상품 PK값,<br>" +
            "    \"categoryId\": 카테고리 PK값,<br>" +
            "    \"featureId\": 맛 PK값,<br>" +
            "    \"countryId\": 국가 PK값,<br>" +
            "    \"aromaId\": 향 PK값,<br>" +
            "    \"nmKor\": 한글 이름,<br>" +
            "    \"nmEng\": 영어 이름,<br>" +
            "    \"price\": 가격,<br>" +
            "    \"quantity\": 수량,<br>" +
            "    \"pic\": 사진,<br>" +
            "    \"promotion\": 프로모션,<br>" +
            "    \"beginner\": 입문자,<br>" +
            "    \"alcohol\": 알코올 도수<br>" +
            "  }")
    public List<WineFoodVo> getWineByFood(@RequestParam Long bigCategoryId
                                        , @RequestParam(defaultValue = "1") int page
                                        , @RequestParam(defaultValue = "9") int row) {
        WineSelByFoodDto dto = new WineSelByFoodDto();
        dto.setPage(page);
        dto.setRow(row);
        dto.setBigCategoryId(bigCategoryId);
        return SERVICE.selWineByFood(dto);
    }

    @GetMapping("/food/new")
    @Operation(summary = "음식별 와인리스트 - 최신등록순")
    public List<WineFoodVo> getWineByFoodNew(@RequestParam Long bigCategoryId
                                            , @RequestParam(defaultValue = "1") int page
                                            , @RequestParam(defaultValue = "9") int row) {
        WineSelByFoodDto dto = new WineSelByFoodDto();
        dto.setBigCategoryId(bigCategoryId);
        dto.setPage(page);
        dto.setRow(row);
        dto.setBigCategoryId(bigCategoryId);
        return SERVICE.selWineByFoodNew(dto);
    }

    @GetMapping("/food/expensive")
    @Operation(summary = "음식별 와인리스트 - 높은금액순")
    public List<WineFoodVo> getWineByFoodExpensive(@RequestParam Long bigCategoryId
                                                , @RequestParam(defaultValue = "1") int page
                                                , @RequestParam(defaultValue = "9") int row) {
        WineSelByFoodDto dto = new WineSelByFoodDto();
        dto.setBigCategoryId(bigCategoryId);
        dto.setPage(page);
        dto.setRow(row);
        dto.setBigCategoryId(bigCategoryId);
        return SERVICE.selWineByFoodExpencive(dto);
    }

    @GetMapping("/food/cheap")
    @Operation(summary = "음식별 와인리스트 - 낮은가격순")
    public List<WineFoodVo> selWineByFoodCheap(@RequestParam Long bigCategoryId
                                            , @RequestParam(defaultValue = "1") int page
                                            , @RequestParam(defaultValue = "9") int row) {
        WineSelByFoodDto dto = new WineSelByFoodDto();
        dto.setBigCategoryId(bigCategoryId);
        dto.setPage(page);
        dto.setRow(row);
        dto.setBigCategoryId(bigCategoryId);
        return SERVICE.selWineByFoodCheap(dto);
    }
}
