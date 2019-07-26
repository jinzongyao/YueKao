package com.jinzongyao.cms.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jinzongyao.cms.dao.ChannelMapper;
import com.jinzongyao.cms.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {
	
	@Resource
	private ChannelMapper channelMapper;

	@Override
	public List<Map> selectChannels() {
		return channelMapper.selectChannels();
	}

	@Override
	public List<Map> selectCategorys(Integer channelId) {
		return channelMapper.selectCategorys(channelId);
	}

}
