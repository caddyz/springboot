package com.ss.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.mapper.HeroMapper;
import com.ss.pojo.Hero;
import com.ss.service.HeroService;
@Service
public class HeroServiceImpl extends ServiceImpl<HeroMapper, Hero> implements HeroService {

}
