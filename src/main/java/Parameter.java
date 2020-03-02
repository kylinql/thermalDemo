import lombok.Data;

/**
 * @Author: kylin
 * @Date: 2020/3/2 下午10:48
 */
@Data
public class Parameter {


    Parameter(){
        this.setORBITAL_ALTITUDE_NEAR(306);
        this.setORBITAL_ALTITUDE_REMOTE(919);
        this.setORBITAL_ECCENTRICITY_RATIO(0.043888);
        this.setORBITAL_HALF_AXIS(6983.7);
        this.setORBITAL_INCLINATION(44.8);
        this.setORBITAL_SHADOW(31.98);
        this.setORBITAL_PERIOD(96.8);

        this.setSATELLITE_WIDTH(0.018);
        this.setSATELLITE_QUALITY(9.1);
        this.setSATELLITE_LENGTH(0.018);
        this.setSATELLITE_HEIGHT(0.022);
    }

    //相关参数
    //卫星构型
    /**
     * 构型（长）
     */
    double SATELLITE_LENGTH;
    /**
     * 构型（宽）
     */
    double SATELLITE_WIDTH;
    /**
     * 构型（高）
     */
    double SATELLITE_HEIGHT;
    /**
     * 轨道长半轴
     */
    double SATELLITE_QUALITY;

    //轨道参数
    /**
     * 轨道高度（远地点）
     */
    double ORBITAL_ALTITUDE_REMOTE;
    /**
     * 轨道高度（近地点
     */
    double ORBITAL_ALTITUDE_NEAR;
    /**
     * 轨道平面倾角
     */
    double ORBITAL_INCLINATION;
    /**
     * 轨道长半轴
     */
    double ORBITAL_HALF_AXIS;
    /**
     * 轨道长半轴
     */
    double ORBITAL_SHADOW;
    /**
     * 轨道长半轴
     */
    double ORBITAL_PERIOD;
    /**
     * 轨道高度（远地点）
     */
    double ORBITAL_ECCENTRICITY_RATIO;
}
