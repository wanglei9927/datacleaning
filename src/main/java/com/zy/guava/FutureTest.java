package com.zy.guava;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class FutureTest {

//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		
//	    ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
//	    String  str = "";
//	    ListenableFuture<Integer> future1 =  service.submit(()->{
//	    	 Thread.sleep(1000);
//	    	 str.split(";");
//             System.out.println("call future 1.");
//             return 1;
//	    });
//	    
//	    
//	    ListenableFuture<Integer> future2 = service.submit(new Callable<Integer>() {
//	        public Integer call() throws InterruptedException {
//	            Thread.sleep(1000);
//	            System.out.println("call future 2.");
//	           //throw new RuntimeException("----call future 2.");
//	            return 2;
//	        }
//	    });
//	    
//	    final ListenableFuture allFutures = Futures.allAsList(future1, future2);
//
//	    
//	    final ListenableFuture transform = Futures.transform(allFutures, new AsyncFunction<List<Integer>, Boolean>() {
//	        @Override
//	        public ListenableFuture apply(List<Integer> results) throws Exception {
//	        	System.out.println(results.get(1));
//	            return Futures.immediateFuture(String.format("success future:%d", results.size()));
//	            
//	        }
//	    });
//	    
//
//	    Futures.addCallback(transform, new FutureCallback<Object>() {
//
//	        public void onSuccess(Object result) {
//	        	service.shutdown();
//	            System.out.println(result.getClass());
//	            System.out.printf("success with: %s%n", result);
//	        }
//
//	        public void onFailure(Throwable thrown) {
//	            System.out.printf("onFailure%s%n", thrown.getMessage());
//	        }
//	    });
//
//	    System.out.println("=="+allFutures.get());
//
//
//		
//	}
}
