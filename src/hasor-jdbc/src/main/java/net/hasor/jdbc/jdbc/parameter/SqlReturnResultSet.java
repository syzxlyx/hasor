/*
 * Copyright 2002-2006 the original author or authors.
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
package net.hasor.jdbc.jdbc.parameter;
import net.hasor.jdbc.jdbc.ResultSetExtractor;
import net.hasor.jdbc.jdbc.RowCallbackHandler;
import net.hasor.jdbc.jdbc.RowMapper;
/**
 * ���������������
 * @author Thomas Risberg
 * @author Juergen Hoeller
 */
public class SqlReturnResultSet extends ResultSetSupportingSqlParameter {
    /**
     * Create a new instance of the {@link SqlReturnResultSet} class.
     * @param name name of the parameter, as used in input and output maps
     * @param extractor ResultSetExtractor to use for parsing the {@link java.sql.ResultSet}
     */
    public SqlReturnResultSet(String name, ResultSetExtractor extractor) {
        super(name, 0, extractor);
    }
    /**
     * Create a new instance of the {@link SqlReturnResultSet} class.
     * @param name name of the parameter, as used in input and output maps
     * @param handler RowCallbackHandler to use for parsing the {@link java.sql.ResultSet}
     */
    public SqlReturnResultSet(String name, RowCallbackHandler handler) {
        super(name, 0, handler);
    }
    /**
     * Create a new instance of the {@link SqlReturnResultSet} class.
     * @param name name of the parameter, as used in input and output maps
     * @param mapper RowMapper to use for parsing the {@link java.sql.ResultSet}
     */
    public SqlReturnResultSet(String name, RowMapper mapper) {
        super(name, 0, mapper);
    }
    /**
     * Return whether this parameter is an implicit return parameter used during the
     * results preocessing of the CallableStatement.getMoreResults/getUpdateCount.
     * <p>This implementation always returns <code>true</code>.
     */
    public boolean isOutputParameter() {
        return true;
    }
}