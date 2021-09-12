package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopcart")
@CrossOrigin
@Api(value = "提供购物车相关业务相关接口", tags = "购物车管理")
public class ShopcartController {

    @GetMapping("/list")
    @ApiOperation("用户登录接口")
    @ApiImplicitParam(dataType = "string", name = "token", value = "授权令牌", required = true)
    public ResultVO listCarts(String token) {

        // 1.获取token
        // 2.校验token
        if (token == null) {
            return new ResultVO(ResStatus.NO, "请先登录", null);
        } else {
            // 验证token
            JwtParser parser = Jwts.parser();
            parser.setSigningKey("QIANfeng666");   //解析token的key与生成的需要一致

            // 如果token正确，有效期内，正常运行，否则异常
            try {
                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                //
                Claims body = claimsJws.getBody();  //获取token中的用户数据
                String subject = body.getSubject(); //获取生成token设置的subject
                String v1 = body.get("key1", String.class); // 获取生成token中map的值

                return new ResultVO(ResStatus.OK, "success", null);
            } catch (Exception e) {
                return new ResultVO(ResStatus.NO, "登录过期。请重新登录！", null);
            }
        }
    }
}
