package qirp.study;

/**
 * @author qirp
 * @version 1.0
 * @date 2021/7/8 10:05 上午
 */
public class ConstructInjection {

	private SpringDao springDao;

	public ConstructInjection(SpringDao springDao) {
		this.springDao = springDao;
	}
}
