{
    grid: {
        left: '0',
        right: '0',
        bottom: '40',
        top:'20',
        containLabel: true
    },
	color:['rgb(78,173,91)','yellow','rgb(234,66,39)'],
    legend: {
        selectedMode:false,
       data: [{
            name: '正常',
            icon: 'rect',
        },{
            name: '低风险',
            icon: 'rect',
        },{
            name: '高风险',
            icon: 'rect',
        }],
        x:'left',      
        y:'bottom',   
        itemWidth:35,
        itemHeight:10,
        padding: 20
    },
 xAxis: [{
        min: -15,
        max: 15,
        type: 'value',
        splitNumber:30,
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
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'yellow',
                        'yellow',
                        'yellow',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'yellow',
                        'yellow',
                        'yellow',
                        'rgb(234,66,39)'
                        ]
                }
        },
        axisLabel:{
            show:true,
            textStyle:{
              color:'black' ,
               fontSize:24
            },
            formatter:function(value,index){
               if (value==-14) {
                    return '15°';
                }if( (value==-7)) {
                    return '7°';
                } if( (value==-4)) {
                    return '4°';
                } if(value===0) {
                    return '0°';
                } if( (value==4)) {
                    return '4°';
                } if( (value==7)) {
                    return '7°';
                } if( (value==14)) {
                    return '15°';
                }
            }
        },
    },{
        min: -15,
        max: 15,
        type: 'value',
        splitNumber:30,
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
                         'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'rgb(234,66,39)',
                        'yellow',
                        'yellow',
                        'yellow',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'rgb(78,173,91)',
                        'yellow',
                        'yellow',
                        'yellow',
                        'rgb(234,66,39)'
                        ]
                }
        },
        axisLabel:{
            show:true,
            textStyle:{
              color:'black',
              fontSize:24
            },
            formatter:function(value,index){
               if (value==-14) {
                    return '15°';
                }if( (value==-7)) {
                    return '7°';
                } if( (value==-4)) {
                    return '4°';
                } if(value===0) {
                    return '0°';
                } if( (value==4)) {
                    return '4°';
                } if( (value==7)) {
                    return '7°';
                } if( (value==14)) {
                    return '15°';
                }
            }
        },
    }],

    yAxis:[{
        min: 0.1,
        max: 17,
        type: 'value',
        splitNumber:17,
        axisLine: {onZero: false},
        axisTick:{
          show:false  
        },
        splitLine:{
          show:false
        },
        axisLabel:{
            show:true,
            textStyle:{
              color:'black',
               fontSize:18
            },
            formatter:function(value,index){
               if (value==17) {
                    return 'T1';
                }if( (value==16)) {
                    return 'T2';
                } if( (value==15)) {
                    return 'T3';
                } if( (value==14)) {
                    return 'T4';
                } if( (value==13)) {
                    return 'T5';
                } if( (value==12)) {
                    return 'T6';
                } if( (value==11)) {
                    return 'T7';
                } if( (value==10)) {
                    return 'T8';
                } if( (value==9)) {
                    return 'T9';
                } if( (value==8)) {
                    return 'T10';
                } if( (value==7)) {
                    return 'T11';
                } if( (value==6)) {
                    return 'T12';
                } if( (value==5)) {
                    return 'L1';
                } if( (value==4)) {
                    return 'L2';
                } if( (value==3)) {
                    return 'L3';
                } if( (value==2)) {
                    return 'L4';
                } if( (value==1)) {
                    return 'L5';
                }
            }
        },
    },{
        min: 0.1,
        max: 17,
        type: 'value',
        splitNumber:17,
        axisLine: {onZero: false},
        axisTick:{
          show:false  
        },
        splitLine:{
          show:false
        },
        axisLabel:{
            show:true,
            textStyle:{
              color:'black',
               fontSize:24
            },
            formatter:function(value,index){
               if(value== 10){
                   return "胸\n椎";
               } if(value==3){
                   return "腰\n椎";
               }
            }
        },
    }],

    series: [
        {
            id: 'a',
			name:'正常',
            type: 'line',
            symbol:'none',
	        smooth: true,
            symbolSize: 5,
            data: [],
            lineStyle:{
                normal:{
                    color:'black'
                }
            },
            markLine: {
            symbol:'none',
    	    data: [
    	        [
    				{
    					itemStyle:{
    						normal:{
    							show:true,
    							color:'black'
    						}
    					},
    					coord:[-15,5.5]
    				},
    				{
    					coord:[15,5.5]
    				}
    			],

    		  ]
    	    },

        },   
        {

            name:'低风险',
            type: 'line',

        },
         {

            name:'高风险',
            type: 'line',
        }

    ]

}