package com.kittyCore.model.DTO;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.kittyCore.model.kittymodel.KittyModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KittyDTO {

    @javax.validation.constraints.NotNull
    private String id;

    @javax.validation.constraints.NotNull
    private String url;

    @javax.validation.constraints.NotNull
    private Long width;

    @javax.validation.constraints.NotNull
    private Long height;

    public KittyDTO(KittyModel model){
        BeanUtils.copyProperties(model,this);
    }

}
