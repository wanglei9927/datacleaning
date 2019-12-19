{
 grid: {
 		left: '0',
        right: '0',
        bottom: '20',
        top:'20',
        containLabel: true
    },
	    xAxis: {
	        min: -90,
	        max: 90,
	        type: 'value',
	        splitNumber:36,
	        axisLine: {
	            onZero: false  
	        }, 
	        axisTick:{
	          show:false,
	          alignWithLabel: false
	        },
	        splitLine:{
	          show:false
	        },
	        splitArea:{
	            show:true,
	                areaStyle:{
	                    color:[
	                        '#72C900',
	                        '#72C900',
	                        '#72C900',
	                        '#72C900',
	                        '#72C900',
	                        '#72C900',
	                        '#72C900',
	                        '#72C900',
	                        '#72C900',
	                        '#FF0000',
	                        '#FF0000',
	                        '#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000','#FF0000',
	                        ]
	                }
	        },
	        axisLabel:{
	            show:true,
	            textStyle:{
	            color:'black',
                fontSize:18
	            },
	           formatter:function(value,index){
	               if (value==-85) {
	                    return '90°';
	                }  if( (value==-45)) {
	                    return '45°';
	                } if(value===0) {
	                    return '0°';
	                } if( (value==45)) {
	                    return '45°';
	                } if( (value==85)) {
	                    return '90°';
	                }
	                
	            }
	        }
	    },
	    yAxis: [{
	        min: 1,
	        max: 100,
	        type: 'value',
	        splitNumber:100,
	        inverse:true,
	        axisLine: {onZero: true},
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
				,fontSize:24
	            },
	            formatter:function(value,index){
	               if (value==1) {
	                    return '90°';
	                }  if( (value==100)) {
	                    return '90°';
	                } if( (value==50)) {
	                    return 'L';
	                }
	            }
	        },
	        
	    },{
	        min: 1,
	        max: 100,
	        type: 'value',
	        splitNumber:100,
	        inverse:true,
	        axisLine: {onZero: true},
	        axisTick:{
	          show:false
	        },
	        splitLine:{
	          show:false
	        },
	        
	        axisLabel:{
	            show:true,
	            textStyle:{
	            color:'black' 
				,fontSize:24
	            },
	            formatter:function(value,index){
	               if( (value==50)) {
	                    return 'R';
	                }
	            }
	        },
	        
	    }]
	    ,series: [
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
	            }
	          
	        }
	    ]
	}
