package zwz.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import zwz.utils.PageUtils;
import zwz.utils.Query;


import zwz.dao.TushuxinxiDao;
import zwz.entity.TushuxinxiEntity;
import zwz.service.TushuxinxiService;
import zwz.entity.vo.TushuxinxiVO;
import zwz.entity.view.TushuxinxiView;

@Service("tushuxinxiService")
public class TushuxinxiServiceImpl extends ServiceImpl<TushuxinxiDao, TushuxinxiEntity> implements TushuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuxinxiEntity> page = this.selectPage(
                new Query<TushuxinxiEntity>(params).getPage(),
                new EntityWrapper<TushuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuxinxiEntity> wrapper) {
		  Page<TushuxinxiView> page =new Query<TushuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuxinxiVO> selectListVO(Wrapper<TushuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuxinxiVO selectVO(Wrapper<TushuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuxinxiView> selectListView(Wrapper<TushuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuxinxiView selectView(Wrapper<TushuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
