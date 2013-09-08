/*
 * Copyright 2008-2009 the original ������(zyc@hasor.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.more.classcode;
/**
 * �����������м价�ڣ������Ŀ���Ǵ��ݹ������ĵ��á���������ڴ��ݵ����ڼ䷢���޷��ҵ���һ�����ݵ��������aop���Ͽ����쳣��
 * @version 2010-9-2
 * @author ������ (zyc@hasor.net)
 */
class AopFilterChain_Impl implements AopFilterChain {
    private AopInvokeFilter thisFilter      = null; //��ʾ���������ĵ�ǰ��������
    private AopFilterChain  nextFilterChain = null; //������������һ����������
    /** */
    AopFilterChain_Impl(AopInvokeFilter thisFilter, AopFilterChain nextFilterChain) {
        this.thisFilter = thisFilter;
        this.nextFilterChain = nextFilterChain;
    }
    public Object doInvokeFilter(Object target, Method method, Object[] args) throws Throwable {
        if (this.nextFilterChain != null)
            return this.thisFilter.doFilter(target, method, args, this.nextFilterChain);
        else
            throw new LostException("����ʧ�ܣ�����Aop����ʧ��");
    }
}