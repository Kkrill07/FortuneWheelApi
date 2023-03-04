package ru.mif.fortunewheel.dto.models;

import ru.mif.fortunewheel.domain.Prize;
import ru.mif.fortunewheel.dto.Model;
import ru.mif.fortunewheel.enums.PrizeType;
import ru.mif.fortunewheel.utils.Patterns;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class PrizeModel implements Model<PrizeModel, Prize> {

    long id;
    String title;
    @Min(value = 8, message = "Длина описания должна быть не менее 8 символов")
    @Max(value = 2048, message = "Длина описания должна быть не более 2048 символов")
    String description;
    @Pattern(regexp = Patterns.URL_PATTERN, message = "Указанный домен не является валидным доменом.")
    String url;
    PrizeType prizeType;

    public PrizeModel(long id, String description, String url, PrizeType prizeType) {
        this.id = id;
        this.description = description;
        this.url = url;
        this.prizeType = prizeType;
    }

    public PrizeModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PrizeType getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(PrizeType prizeType) {
        this.prizeType = prizeType;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public Prize toEntity(PrizeModel prizeModel) {
        return new Prize(prizeModel.getTitle(),prizeModel.getDescription(), prizeModel.getUrl(), prizeModel.getPrizeType());
    }
}
