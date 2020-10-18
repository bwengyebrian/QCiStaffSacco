package com.qualitychemicals.qciss.loan.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    @ApiModelProperty(notes = "db generated LoanT Product ID")
    private  int id;
    @NotBlank(message = "name cannot be blank")
    @Size(min=3, message = "name at least 3 Characters")
    @ApiModelProperty(notes = "LoanT Product Name")
    private String name;
    @NotBlank(message ="penalty cannot be Blank")
    @ApiModelProperty(notes = "LoanT Product penalty (%age of principal)")
    private int penalty;
    @NotBlank(message ="interest cannot be Blank")
    @ApiModelProperty(notes = "LoanT Product Interest rate (%age of principal)")
    private int interest;//%age of principal
    @NotBlank(message ="Min Amount cannot be Blank")
    @ApiModelProperty(notes = "LoanT Product min request amount")
    private double minAmount;
    @NotBlank(message ="Max Amount cannot be Blank")
    @ApiModelProperty(notes = "LoanT Product max request amount")
    private double maxAmount;
    @NotBlank(message ="Min Duration cannot be Blank")
    @ApiModelProperty(notes = "LoanT Product min payment Duration")
    private int minDuration;//months
    @NotBlank(message ="Max Duration cannot be Blank")
    @ApiModelProperty(notes = "LoanT Product max payment Duration")
    private int maxDuration;//months
    @NotBlank(message ="Provide a LoanT Description")
    @ApiModelProperty(notes = "LoanT Product Description")
    private String description;
}
