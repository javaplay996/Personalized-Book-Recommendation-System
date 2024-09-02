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


import zwz.dao.TuihuantushuDao;
import zwz.entity.TuihuantushuEntity;
import zwz.service.TuihuantushuService;
import zwz.entity.vo.TuihuantushuVO;
import zwz.entity.view.TuihuantushuView;

@Service("tuihuantushuService")
public class TuihuantushuServiceImpl extends ServiceImpl<TuihuantushuDao, TuihuantushuEntity> implements TuihuantushuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuihuantushuEntity> page = this.selectPage(
                new Query<TuihuantushuEntity>(params).getPage(),
                new EntityWrapper<TuihuantushuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuihuantushuEntity> wrapper) {
		  Page<TuihuantushuView> page =new Query<TuihuantushuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuihuantushuVO> selectListVO(Wrapper<TuihuantushuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuihuantushuVO selectVO(Wrapper<TuihuantushuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuihuantushuView> selectListView(Wrapper<TuihuantushuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuihuantushuView selectView(Wrapper<TuihuantushuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
