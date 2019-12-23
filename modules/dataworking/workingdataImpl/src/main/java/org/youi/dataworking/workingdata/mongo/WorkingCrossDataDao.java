/*
 * YOUI框架
 * Copyright 2018 the original author or authors.
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
package org.youi.dataworking.workingdata.mongo;

import org.youi.framework.mongo.DaoMongo;
import org.youi.dataworking.workingdata.entity.WorkingCrossData;

import java.util.List;

/**
 * <p>系统描述: </p>
 * <p>功能描述: WorkingCrossData-数据持久层接口</p>
 * @author 代码生成器
 * @since 1.0.0
 */
public interface WorkingCrossDataDao extends DaoMongo<WorkingCrossData, String>  {

    /**
     * 主键集合查询交叉表数据
     * @param ids
     * @return
     */
    List<WorkingCrossData> findByIdIn(List<String> ids);
}