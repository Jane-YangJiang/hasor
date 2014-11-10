/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
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
package net.test.web.biz.user.entity;
import java.util.Date;
import net.hasor.db.ar.AbstractTable;
/**
 * User 实体类
 * @version : 2014年9月24日
 * @author 赵永春(zyc@hasor.net)
 */
public class UserBean extends AbstractTable {
    private String userUUID      = null;
    private String name          = null;
    private String loginName     = null;
    private String loginPassword = null;
    private String email         = null;
    private Date   registerTime  = null;
}