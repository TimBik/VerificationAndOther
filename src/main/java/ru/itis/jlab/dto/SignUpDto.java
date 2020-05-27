package ru.itis.jlab.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SignUpDto {
    @NotNull(message = "{errors.null}")
    private String login;
    @NotNull(message = "{errors.null}")
    private String password;

    @Email(message = "Введите валидную почту")
    private String mail;

    @NotNull(message = "{errors.null}")
    @Min(value = 0, message = "Люди столько не живут")
    private Integer age;
}
