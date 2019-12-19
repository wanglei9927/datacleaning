{
    grid: {
        left: '0',
        right: '80',
        bottom: '20',
        top:'0',
        containLabel: true
    },
    xAxis: {
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
                        '#FF0000',
                        '#FF0000',
                        '#FF0000',
                        '#FF0000',
                        '#FF0000',
                        '#FF0000',
                        '#FF0000',
                        '#FF0000',
                        '#FFFF00',
                        '#FFFF00',
                        '#FFFF00',
                        '#00FF00',
                        '#00FF00',
                        '#00FF00',
                        '#00FF00',
                        '#00FF00',
                        '#00FF00',
                        '#00FF00',
                        '#00FF00',
                        '#FFFF00',
                        '#FFFF00',
                        '#FFFF00',
                        '#FF0000'
                        ]
                }
        },
        axisLabel:{
            show:false,
            textStyle:{
              color:'black'  
            },
            formatter:function(value,index){
               if (value==-14) {
                    return '15°';
                }if( (value==-7)) {
                    return '7°';
                } if( (value==-4)) {
                    return '4°';
                } if( (value==4)) {
                    return '4°';
                } if( (value==7)) {
                    return '7°';
                } if( (value==14)) {
                    return '15°';
                }
            }
        },
    },

    yAxis: {
        min: 1,
        max: 3,
        type: 'value',
        
       
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
                if(value==2){
                    return "胸椎";
                }
               
            }
        },
    },

    series: [
        {
            id: 'a',
            type: 'line',
            symbol:'rect',
	        smooth: true,
            symbolSize:[5, 30] ,
            itemStyle: {
                normal: {
                    color: "black",
                    lineStyle: {
                        color: "black"
                    }
                }
            },
            data:${data}

        }

    ]

}