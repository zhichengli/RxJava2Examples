package com.nanchen.rxjava2examples.module.rxjava2.operators;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/**
 * filter
 * <p>
 * 过滤操作符，取争取的值
 * <p>
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  10:55
 */

public class RxFilterActivity extends RxOperatorBaseActivity {
    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_filter);
    }

    @Override
    protected void doSomething() {
        Observable.just(1, 20, 65, -5, 7, 19)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(@NonNull Integer integer) throws Exception {
                        return integer >= 10;
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                mRxOperatorsText.append("filter : " + integer + "\n");
            }
        });
    }
}
