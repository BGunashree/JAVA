package com.xworkz.functionalinterface.runner;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

import com.xworkz.functionalinterface.interfaces.FoodApp;
import com.xworkz.functionalinterface.interfaces.Starter;

import com.xworkz.functionalinterface.usage.Labour;

public class Runner {

	public static void main(String[] args) {
		
		
		Starter starter=()->
				{
			                System.out.println("running on in Starter");
				};
				

		FoodApp foodApp=(item)->{
			  System.out.println(item);
		};
		
		Labour labour=new Labour();
		labour.order(foodApp);
		
		
		//1
		BiConsumer<Integer,String> biconsumer=(ref,ref1)->System.out.println("Biconsumer FI");
		
		//2
		BiFunction<Integer,String,Boolean> biFunction=(ref,ref1)->ref>1000;
		
		//3
		BinaryOperator<String> binaryOperator=(ref,ref1)->null;
		
		//4
		BiPredicate<String,String> biPredicate=(ref,ref1)->ref==ref1;
		
		//5
		BooleanSupplier booleanSupplier=()->false;
		
		//6
		Consumer<Integer> consumer=(ref)-> System.out.println("Consumer FI");
		
		//7
		DoubleBinaryOperator doubleBinaryOperator=(double left,double right)->left+right;
		
		//8
		DoubleConsumer doubleConsumer=(double value)->System.out.println("DoubleConsumer FI");
		
		//9
		DoubleFunction<Boolean> doubleFunction=(double value)->value>0;
		
		//10
		DoublePredicate doublePredicate=(double value)->{
			System.out.println("DoublePredicate FI");
			return false;
		};
		
		//11
		DoubleSupplier doubleSupplier=()-> 1000*1000;
		
		//12
		DoubleToIntFunction doubleToIntFunction=(double value)->1;
		
		//13
		DoubleToLongFunction doubleToLongFunction=(double value)->{
			System.out.println("DoubleToLongFunction FI");
			return 8961142535L;
		};
		
		//14
		DoubleUnaryOperator doubleUnaryOperator=(double operand)->operand;
		
		//15
		Function<String,Integer> function=(String var)->null;
		
		//16
		IntBinaryOperator intBinaryOperator=(int left, int right)->left;
		
		//17
		IntConsumer intConsumer=(int value)->System.out.println("IntConsumer FI");
		
		//18
		IntFunction<Boolean> intFunction=(int value)->false;
		
		//19
		IntPredicate intPredicate=(int value)->{
			System.out.println("IntPredicate FI");
			return false;
		};
		
		//20
		IntSupplier intSupplier=()->{
			System.out.println("IntSupplier FI");
			return 0;
		};
		
		//21
		IntToDoubleFunction intToDoubleFunction=(int value)->{
			System.out.println("IntToDoubleFunction FI");
			return 9.2;
		};
		
		//22
		IntToLongFunction intToLongFunction=(int value)->(long)value;
		
		//23
		IntUnaryOperator intUnaryOperator=(int op)->op;
		
		//24
		LongBinaryOperator longBinaryOperator=(long left,long right)->left*right;
		
		//25
		LongConsumer longConsumer=(long value)->System.out.println("LongConsumer FI");
		
		//26
		LongFunction<Boolean> longFunction=(long value)->false;
		
		//27
		LongPredicate longPredicate=(long value)->{
			System.out.println("LongPredicate FI");
			return false;
		};
		
		//28
		LongSupplier longSupplier=()-> 8951144517L;
		
		//29
		LongToDoubleFunction longToDoubleFunction=(long value)->2.5;
		
		//30
		LongToIntFunction longToIntFunction=(long value)->(int)value;
		
		//31
		LongUnaryOperator longUnaryOperator=(long operand)->3782167288L;
		
		//32
		ObjDoubleConsumer<Boolean> objDoubleConsumer=(Boolean t,double value)->System.out.println("ObjDoubleConsumer FI");
		
		//33
		ObjIntConsumer<Integer> objIntConsumer=(Integer t,int value)->System.out.println("ObjIntConsumer FI");
		
		//34
		ObjLongConsumer<String> objLongConsumer=(String t,long value)->System.out.println("ObjLongConsumer FI");
		
		//35
		Predicate<Integer> predicate=(Integer t)->false;
		
		//36
		Supplier<Boolean> supplier=()->false;
		
		//37
		ToDoubleBiFunction<String,Boolean> toDoubleBiFunction=(String t,Boolean u)->3.147;
		
		//38
		ToDoubleFunction<Integer> toDoubleFunction=(Integer value)->8.9;
		
		//39
		ToIntBiFunction<String,Boolean> toIntBiFunction=(String,Boolean)->0;
		
		//40
		ToIntFunction<Integer> toIntFunction=(Integer value)->value;
		
		//41
		ToLongBiFunction<Boolean,Integer> toLongBiFunction=(t,u)->3435467590L;
		
		//42
		ToLongFunction<Boolean> toLongFunction=(value)->1234567898L;
		
		//43
		UnaryOperator<Integer> unaryOperator=(Integer var)->null;
		
		
		
		
		
		
		
	}

}
