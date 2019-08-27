/*
 * Copyright 2012-2018 the original author or authors.
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
package org.youi.dataquery.engine.model;

import org.springframework.util.CollectionUtils;
import org.youi.framework.core.dataobj.Domain;
import org.youi.framework.core.dataobj.tree.AbstractTreeNode;

/**
 * @author zhouyi
 * @see
 * @since 2.0.0
 */
public class ItemTreeNode extends AbstractTreeNode {

    private int itemIndex;

    public ItemTreeNode(String id, String text,int itemIndex) {
        super(id, text);
        this.itemIndex = itemIndex;
    }

    public boolean hasChild(){
        return !CollectionUtils.isEmpty(this.getChildren());
    }

    @Override
    public void setCheck(String s) {

    }

    @Override
    public void setSrc(String s) {

    }

    @Override
    public Domain getDomain() {
        return null;
    }

    @Override
    public void setDomain(Domain domain) {

    }

    @Override
    public void setExpanded(boolean b) {

    }

    @Override
    public boolean getExpanded() {
        return false;
    }

    @Override
    public String getHref() {
        return null;
    }

    @Override
    public void setHref(String s) {

    }

    public int getItemIndex() {
        return itemIndex;
    }

    public void setItemIndex(int itemIndex) {
        this.itemIndex = itemIndex;
    }
}