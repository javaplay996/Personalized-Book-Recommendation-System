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


import zwz.dao.TushuyuyueDao;
import zwz.entity.TushuyuyueEntity;
import zwz.service.TushuyuyueService;
import zwz.entity.vo.TushuyuyueVO;
import zwz.entity.view.TushuyuyueView;

@Service("tushuyuyueService")
public class TushuyuyueServiceImpl extends ServiceImpl<TushuyuyueDao, TushuyuyueEntity> implements TushuyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuyuyueEntity> page = this.selectPage(
                new Query<TushuyuyueEntity>(params).getPage(),
                new EntityWrapper<TushuyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuyuyueEntity> wrapper) {
		  Page<TushuyuyueView> page =new Query<TushuyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuyuyueVO> selectListVO(Wrapper<TushuyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuyuyueVO selectVO(Wrapper<TushuyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuyuyueView> selectListView(Wrapper<TushuyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuyuyueView selectView(Wrapper<TushuyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
