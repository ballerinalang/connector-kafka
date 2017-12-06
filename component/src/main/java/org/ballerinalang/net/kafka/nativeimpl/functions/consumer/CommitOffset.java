/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ballerinalang.net.kafka.nativeimpl.functions.consumer;

import org.ballerinalang.bre.Context;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BValue;
import org.ballerinalang.natives.AbstractNativeFunction;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.ReturnType;
import org.ballerinalang.natives.annotations.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@code }
 */
@BallerinaFunction(packageName = "ballerina.net.kafka",
        functionName = "commitOffset",
        receiver = @Receiver(type = TypeKind.STRUCT, structType = "KafkaConsumer",
                structPackage = "ballerina.net.kafka"),
        args = {
                @Argument(name = "c",
                        type = TypeKind.STRUCT, structType = "KafkaConsumer",
                        structPackage = "ballerina.net.kafka"),
                @Argument(name = "partition", type = TypeKind.STRUCT, structType = "Offset",
                        structPackage = "ballerina.net.kafka")
        },
        returnType = { @ReturnType(type = TypeKind.STRUCT)},
        isPublic = true)
public class CommitOffset extends AbstractNativeFunction {
    private static final Logger log = LoggerFactory.getLogger(CommitOffset.class);

    @Override
    public BValue[] execute(Context context) {

        return VOID_RETURN;
    }

}


