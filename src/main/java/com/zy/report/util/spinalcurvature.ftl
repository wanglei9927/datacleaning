{
   
    grid: {
        left: '0',
        right: '80',
        bottom: '20',
        top:'20',
        containLabel: true
    },
    xAxis: {
        min: -60,
        max: 61,
        type: 'value',
        splitNumber:12,
        inverse:false,
        axisLine: {
            onZero: true  
        },
        axisTick:{
          show:false  
        },
        splitLine:{
          show:false
        },
        splitArea:{
            show:true,
                areaStyle:{
                    color:[
                        'white',
                        'green',
                        'green',
                        'white',
                        'white',
                        'white',
                        'red',
                        'red',
                        'green',
                        'green',
                        'red',
                        'red'
                        ]
                }
        },
        axisLabel:{
            show:true,
            textStyle:{
              color:'black'  
            },formatter:function(value,index){
               if (value==-60) {
                    return '60°';
                }if( (value==-50)) {
                    return '50°';
                }if( (value==-30)) {
                    return '30°';
                }if(value===0) {
                    return '0°';
                }if( (value==20)) {
                    return '20°';
                }if( (value==40)) {
                    return '40°';
                }if( (value==60)) {
                    return '60°';
                }
                
            }
        }
    },
    yAxis: {
        min: 0,
        max: 17,
        type: 'value',
        splitNumber:17,
        inverse:false,
        axisLine: {onZero: false},
        axisTick:{
          show:false
        },
        splitLine:{
          show:true
        },
        
        axisLabel:{
            show:true,
            textStyle:{
              color:'black'  
            },
            formatter:function(value,index){
               if (value==17) {
                    return 'T1';
                }
                if( (value==16)) {
                    return 'T2';
                }if( (value==15)) {
                    return 'T3';
                }if( (value==14)) {
                    return 'T4';
                }if( (value==13)) {
                    return 'T5';
                }if( (value==12)) {
                    return 'T6';
                }if( (value==11)) {
                    return 'T7';
                }if( (value==10)) {
                    return 'T8';
                }if( (value==9)) {
                    return 'T9';
                }if( (value==8)) {
                    return 'T10';
                }if( (value==7)) {
                    return 'T11';
                }if( (value==6)) {
                    return 'T12';
                }if( (value==5)) {
                    return 'L1';
                }if( (value==4)) {
                    return 'L2';
                }if( (value==3)) {
                    return 'L3';
                }if( (value==2)) {
                    return 'L4';
                }if( (value==1)) {
                    return 'L5';
                }
            }
        },
        
    },
    series: [
        {
            id: 'a',
            type: 'line',
            symbol:'none',
            smooth: true, 
            symbolSize: 5,
            data: ${data},
            lineStyle:{
                normal:{
                    color:'black'
                }
            },
            markLine: {
            symbol:"none",
    	    data: [
    	        [
    				{
						name:'胸\n椎\n\n\n\n\n\n\n\n腰\n椎',
    					itemStyle:{
    						normal:{
    							show:true,
    							color:'black',
    							type:"solid"
    						}
    					},
    					coord:[-60,6]
    				},
    				{
    					coord:[60,6]
    				}
    			],
    			[
    				{
    					name:'0°',
    					itemStyle:{
    						normal:{
    							show:true,
    							color:'black'
    						}
    					},
    					coord:[0,1]
    				},
    				{
    					coord:[0,17]
    				}
    			],
    			
    		  ]
    	    },
        }
    ]
}